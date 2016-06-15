using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Sorveteria {
    class SorveteComCobertura : ISorvete{
        //Component : IComponent
        ISorvete s;


        public SorveteComCobertura(ISorvete s) {
            this.s = s;
            MessageBox.Show("Add chocolate!+2");
        }

        public string Nome {
            get {
                return this.s.Nome + " ADD Chocolate!";
            }
        }


        //State
        public double Preco {
            get {
                return this.s.Preco + 2;
            }
        }
    }
}
