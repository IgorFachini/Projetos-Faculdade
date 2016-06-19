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
    public partial class COMPLEMENTO : Form {
        public COMPLEMENTO() {
            InitializeComponent();
        }

        public COMPLEMENTO(String usuario, String recipiente, double valorRecipiente, String sabor, double valorSabor) {
            InitializeComponent();
            this.usuario = usuario;
            this.recipiente = recipiente;
            this.sabor = sabor;
            this.valorRecipiente = valorRecipiente;
            this.valorSabor = valorSabor;
            nomeUser.Text = usuario;

        }
        String usuario;
        String recipiente;
        String sabor;
        double valorRecipiente;
        double valorSabor;

        private void button2_Click(object sender, EventArgs e) {

        }

        private void COMPLEMENTO_Load(object sender, EventArgs e) {

        }

        private void pronto_Click(object sender, EventArgs e) {
            double contador = 0;
            String adicionais = "";
            if (balinhas.Checked) {
                contador += 0.5;
                adicionais = (adicionais + "\n+ Balinhas");
            }
            if (cobertura.Checked) {
                contador += 0.8;
                adicionais = (adicionais + "\n+ Cobertura");
            }
            if (granulados.Checked) {
                contador += 0.4;
                adicionais = (adicionais + "\n+ Granulados");
            }
            if (tubetes.Checked) {
                contador += 1;
                adicionais = (adicionais + "\n+ Tubetes");
            }
            TOTAL total = new TOTAL(usuario, recipiente, valorRecipiente, sabor, valorSabor, adicionais, contador);
            this.Hide();
            total.Show();

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
