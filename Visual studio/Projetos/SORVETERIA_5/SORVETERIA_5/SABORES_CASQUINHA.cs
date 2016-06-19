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
    public partial class 
        SABORES_CASQUINHA : Form {
        public SABORES_CASQUINHA() {
            InitializeComponent();
        }

        public SABORES_CASQUINHA(String usuario, String casquinha, double valorCasquinha) {
            InitializeComponent();
            this.usuario = usuario;
            this.casquinha = casquinha;
            this.valorCasquinha = valorCasquinha;
            nomeUser.Text = usuario;
        }
        String usuario;
        String casquinha;
        double valorCasquinha;

        private void chocolate_Click(object sender, EventArgs e) {
            COMPLEMENTO complemento = new COMPLEMENTO(usuario, casquinha, valorCasquinha, "Chocolate", 1.5);
            this.Hide();
            complemento.Show();
        }

        private void baunilha_Click(object sender, EventArgs e) {
            COMPLEMENTO complemento = new COMPLEMENTO(usuario, casquinha, valorCasquinha, "Baunilha", 1.3);
            this.Hide();
            complemento.Show();
        }

        private void misto_Click(object sender, EventArgs e) {
            COMPLEMENTO complemento = new COMPLEMENTO(usuario, casquinha, valorCasquinha, "Misto", 1.8);
            this.Hide();
            complemento.Show();
        }

        private void SABORES_CASQUINHA_Load(object sender, EventArgs e) {

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
