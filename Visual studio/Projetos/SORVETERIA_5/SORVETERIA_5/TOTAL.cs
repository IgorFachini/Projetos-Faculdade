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
    public partial class TOTAL : Form {
        public TOTAL() {
            InitializeComponent();
        }

        public TOTAL(String usuario, String recipiente, double vRecipiente,
                     String sabor, double vSabor,
                     String adicionais, double vAdicionais) {
            InitializeComponent();
            this.usuario = usuario;
            this.recipiente = recipiente;
            this.sabor = sabor;
            this.adicionais = adicionais;
            this.vRecipiente = vRecipiente;
            this.vSabor = vSabor;
            this.vAdicionais = vAdicionais;

            texto.Text = "- Usuario: " + usuario +
                "\n- Recipiente: " + recipiente + " R$" + this.vRecipiente +
                "\n- Sabores: " + sabor + " R$" + vSabor +
                "\n- Adicionais: " + adicionais + " R$" + vAdicionais;
            double conta = this.vRecipiente + this.vSabor + this.vAdicionais;

            resultado.Text = "R$: " + conta;

            nomeUser.Text = usuario;

        }
        String usuario;
        String recipiente;
        String sabor;
        String adicionais;
        double vRecipiente;
        double vSabor;
        double vAdicionais;

        private void texto_Click(object sender, EventArgs e) {

        }

        private void TOTAL_Load(object sender, EventArgs e) {

        }

        private void cancelar_Click(object sender, EventArgs e) {
            RECIPIENTE recipiente = new RECIPIENTE(usuario);
            if (MessageBox.Show("CANCELAR ESTE SORVETE?", "Tem certeza?", MessageBoxButtons.YesNo) == DialogResult.Yes) {
                this.Hide();
                recipiente.Show();
            }
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
