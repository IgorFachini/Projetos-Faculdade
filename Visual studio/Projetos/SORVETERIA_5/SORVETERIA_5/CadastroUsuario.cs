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
    public partial class CadastroUsuario : Form
    {
        Login lg = new Login();
        public CadastroUsuario()
        {
            InitializeComponent();
        }

        private void btnCadastrar_Click(object sender, EventArgs e)
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

            String usuario = txtNome.Text;
            String senha = txtSenha.Text;
            String confirmaSenha = txtConfirmaSenha.Text;

            SqlCommand command = new SqlCommand("SELECT * FROM [tbUsuario] WHERE usuario = '" + usuario
                + "'", cn);

            SqlDataReader reader = null;
            reader = command.ExecuteReader();
            if (!usuario.Equals(""))
            {
                if (reader.Read())
                {
                    if (reader["usuario"].ToString().Equals(txtNome.Text))
                    {
                        MessageBox.Show("Usuario ja existe", "Aviso", MessageBoxButtons.OK, MessageBoxIcon.Error);
                        
                    }


                }
                else
                {
                    cn.Close();
                    if (senha.Equals(""))
                    {
                        MessageBox.Show("Digite a senha", "Aviso", MessageBoxButtons.OK, MessageBoxIcon.Warning);
                    }
                    else if (senha.Equals(confirmaSenha))
                    {

                        cn.Open();
                        command = new SqlCommand("INSERT INTO [tbUsuario] VALUES('" + usuario
                        + "','" + senha + "','"+null+"')", cn);
                        command.CommandType = CommandType.Text;
                        command.ExecuteNonQuery();
                        txtNome.ResetText();
                        txtSenha.ResetText();
                        txtConfirmaSenha.ResetText();
                        cn.Close();
                        MessageBox.Show("Usuario ( " + usuario + " ) cadastrado ^^", "Parabens", MessageBoxButtons.OK, MessageBoxIcon.Information);
                    }
                    else
                    {
                        MessageBox.Show("Senha nao confere", "Errou seu vesgo", MessageBoxButtons.OK, MessageBoxIcon.Exclamation);
                    }
                }


            }
            else
            {
                MessageBox.Show("Digite o nome", "Erro seu vesgo", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            }
            cn.Close();






        }

        private void btnSair_Click(object sender, EventArgs e)
        {
            this.Hide();

            lg.ShowDialog();

            //Application.Exit();
        }
    }
}
