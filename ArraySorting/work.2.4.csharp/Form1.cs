using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using ArraySortingDll;

namespace work._2._4.csharp
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                String input = textBox1.Text;
                String[] inputArray = input.Split(',');

                int len = inputArray.Length;
                int[] a = new int[len];

                for (int i = 0; i < len; i++)
                {
                    a[i] = Convert.ToInt32(inputArray[i]);
                }

                String method = Convert.ToString(comboBox1.SelectedItem);

                switch (method)
                {
                    case "Метод вставки": ArraySortingDll.Methods.doInsertMethod(a, len); break;
                    case "Метод вибору": ArraySortingDll.Methods.doSelectSort(a, len); break;
                    case "Метод швидкого сортування": ArraySortingDll.Methods.doQuickSort(a, len); break;
                    case "Метод бульбашки": ArraySortingDll.Methods.doBubbleSort(a, len); break;
                    default: throw new Exception("Невірно обрано метод");
                }

                if (checkBox1.Checked) ArraySortingDll.Methods.reverse(a, len);

                String s = "";
                for (int i = 0; i < len; i++)
                {
                    s = s + a[i] + " ";
                }

                textBox2.Text = s;
            }
            catch (Exception exception)
            {
                textBox2.Text = exception.Message;
            }

        }

    }
}
