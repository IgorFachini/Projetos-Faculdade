using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace SORVETERIA_5 {
    public partial class RECIPIENTE : Form {
        public RECIPIENTE() {
            InitializeComponent();
        }

        public RECIPIENTE(String usuario) {
            InitializeComponent();
            this.usuario = usuario;
            nomeUser.Text = usuario;
        }

        String usuario;

        private void casquinha_Click(object sender, EventArgs e) {
            SABORES_CASQUINHA sabor = new SABORES_CASQUINHA(usuario,"Casquinha", 1);
            this.Hide();
            sabor.Show();
        }

        private void cascao_Click(object sender, EventArgs e) {
            SABORES_CASQUINHA sabor = new SABORES_CASQUINHA(usuario, "Cascao", 1.5);
            this.Hide();
            sabor.Show();
        }

        private void pote_Click(object sender, EventArgs e) {
            SABORES_POTE sabor = new SABORES_POTE(usuario, 2);
            this.Hide();
            sabor.Show();
        }

        private void RECIPIENTE_Load(object sender, EventArgs e) {

        }

        private void label8_Click(object sender, EventArgs e) {

        }

        private void sair_Click(object sender, EventArgs e) {
            if (MessageBox.Show("SAIR DESTE USUARIO?", "LOGOFF?", MessageBoxButtons.YesNo) == DialogResult.Yes) {
                this.Hide();
                Login lg = new Login();
                lg.Show();
            }
        }
    }
}
