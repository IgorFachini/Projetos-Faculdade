using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SORVETERIA_5
{
    public partial class Login : Form
    {
        public Login()
        {
            InitializeComponent();
        }

        private void btnCadastrar_Click(object sender, EventArgs e)
        {
            CadastroUsuario cadastro = new CadastroUsuario();
            this.Hide();

            cadastro.ShowDialog();

            Application.Exit();
        }

        private void btnEntrar_Click(object sender, EventArgs e)
        {
            String connection = @"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=|DataDirectory|\DadosUser.mdf;Integrated Security=True";
            SqlConnection cn = new SqlConnection(connection);
            try
            {
                cn.Open();
            }
            catch (SqlException)
            {
                MessageBox.Show("Nao foi possivel se conectar", "Aviso", MessageBoxButtons.OK, MessageBoxIcon.Error);

            }

            String usuario = txtUsuario.Text;
            String senha = txtSenha.Text;

            SqlCommand command = new SqlCommand("SELECT * FROM [tbUsuario] WHERE usuario = '" + usuario
                + "'", cn);

            SqlDataReader reader = null;
            reader = command.ExecuteReader();
            if (!usuario.Equals(""))
            {
                if (reader.Read())
                {
                    if (!senha.Equals(""))
                    {
                        command = new SqlCommand("SELECT * FROM [tbUsuario] WHERE usuario = '" + usuario
                             + "' AND senha = '" + senha + "'", cn);
                        reader.Close();
                        reader = null;
                        reader = command.ExecuteReader();
                        if (reader.Read())
                        {
                            RECIPIENTE mts = new RECIPIENTE();

                            this.Hide();

                            mts.ShowDialog();

                            Application.Exit();
                        }
                        else
                        {
                            MessageBox.Show("Senha invalida", "Atenção caipira", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                        }

                    }
                    else
                    {
                        MessageBox.Show("Informe a senha", "Sua senha não é branca seu pacifista!!!!!", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                    }

                }
                else
                {
                    MessageBox.Show("Usuario não cadastrado", "Aviso", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }

            }
            else
            {
                MessageBox.Show("Informe o usuario", "Aviso", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
            }


        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            Close();
        }
    }
}
