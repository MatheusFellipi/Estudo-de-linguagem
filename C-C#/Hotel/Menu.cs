using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Hotel
{
    public partial class FrmMenu : Form
    {
        public FrmMenu()
        {
            InitializeComponent();
        }

        private void FrmMenu_Load(object sender, EventArgs e)
        {

        }

        private void FrmMenu_Resize(object sender, EventArgs e)
        {
            this.WindowState = FormWindowState.Maximized;
        }

        private void LoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Close();
        }

        private void FuncionarioToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Cadastro.FrmFuncionario frmFuncionario = new Cadastro.FrmFuncionario();
            frmFuncionario.Show();

        }
    }
}
