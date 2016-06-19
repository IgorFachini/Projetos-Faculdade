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

        private void casquinha_Click(object sender, EventArgs e) {
            SABORES_CASQUINHA sabor = new SABORES_CASQUINHA("Casquinha", 1);
            this.Hide();
            sabor.Show();
        }

        private void cascao_Click(object sender, EventArgs e) {
            SABORES_CASQUINHA sabor = new SABORES_CASQUINHA("Cascao", 1.5);
            this.Hide();
            sabor.Show();
        }

        private void pote_Click(object sender, EventArgs e) {
            SABORES_POTE sabor = new SABORES_POTE(2);
            this.Hide();
            sabor.Show();
        }
    }
}
