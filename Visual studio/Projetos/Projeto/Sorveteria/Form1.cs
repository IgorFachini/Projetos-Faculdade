using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Sorveteria
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            Sorvete s = new Sorvete();

            MessageBox.Show("Sorvete:" + s.Preco);


            SorveteComCobertura c;
            c = new SorveteComCobertura(s);

            SorveteComCobertura d;
            d = new SorveteComCobertura(c);

            MessageBox.Show("Sorvete com cobertura:" +d.Preco);


        }

        private void Form1_Load(object sender, EventArgs e) {

        }

        private void textBox1_TextChanged(object sender, EventArgs e) {

        }
    }
}
