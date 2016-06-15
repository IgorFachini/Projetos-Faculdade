using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Sorveteria {
    sealed class Sorvete : ISorvete{
        public string Nome {
            get {
                return "Novo sorvete!1,5";
            }
        }

        public double Preco {
            get {
                return 1.5;
            }
        }

        string ISorvete.Nome {
            get {
                return "Novo";
            }
        }
    }
}
