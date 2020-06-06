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
    public partial class FrmLogin : Form
    {
        public FrmLogin()
        {
            InitializeComponent();
            Pnl_Login.Visible = false;
        }

        private void FrmLogin_Load(object sender, EventArgs e)
        {
            //METODO DE ENTRADA DA TELA PRINCIPAL
            redimeçaoPnl();
            //COR BTN ENTRAR
            BtnEntrar.FlatAppearance.MouseOverBackColor = Color.FromArgb(0,0,0);
            BtnEntrar.FlatAppearance.MouseDownBackColor = Color.FromArgb(76, 255, 85);
            //HABILITA EVENTO DO TECLADO
            this.KeyPreview = true;
           
        }
        // AÇAO DO BOTAO DE ENTRADA
        private void BtnEntrar_Click(object sender, EventArgs e)
        {
            FrmMenu frmMenu = new FrmMenu();

            VerificarCampusLogin();
            limpar();
            TxtUsuario.Focus();

          //ABRE A TELA PRINCIPAL
            frmMenu.Show();
        }

        private void FrmLogin_KeyDown(object sender, KeyEventArgs e)
        {
            if (e.KeyCode == Keys.Enter)
            {
                VerificarCampusLogin();
            }
        }


        public void VerificarCampusLogin()
        {
            if (TxtUsuario.Text == "" || TxtSenha.Text == "")
            {
                MessageBox.Show("Usuario ou a senha estam vazio Preencha");
                TxtUsuario.Focus();

              
            }
            else
            {
                
            }
        }
        //LIMPAR OS OS DADOS DA CAIXAS
        private void limpar()
        {
            TxtSenha.Text = "";
            TxtUsuario.Text = "";
        }
        //REDIMECIONA O PANEL DE LONGIN
        public void redimeçaoPnl()
        {
            Pnl_Login.Location = new Point(this.Width / 2 - 197, this.Height / 2 - 167);
            Pnl_Login.Visible = true;

        }
        private void FrmLogin_Resize(object sender, EventArgs e)
        {
            redimeçaoPnl();
        }
    }
}
