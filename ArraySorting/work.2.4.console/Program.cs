using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ArraySortingDll;

namespace work._2._4.console
{
    class Program
    {
        static void Main(string[] args)
        {
            bool fail = true;
            while (fail)
            {
                try
                {
                    Console.WriteLine("Enter your array. Separete elements with coma.");
                    String input = Console.ReadLine();
                    String[] inputArray = input.Split(',');
                    fail = false;

                    int len = inputArray.Length;
                    int[] a = new int[len];

                    for (int i = 0; i < len; i++)
                    {
                        a[i] = Convert.ToInt32(inputArray[i]);
                    }

                    int method;
                    do
                    {
                        Console.WriteLine("Select the method:");
                        Console.WriteLine("1. Method of select");
                        Console.WriteLine("2. Method of insert");
                        Console.WriteLine("3. Method of bubble");
                        Console.WriteLine("4. Method of quick sort");
                        method = Convert.ToInt32(Console.ReadLine());
                        switch (method)
                        {
                            case 1: ArraySortingDll.Methods.doSelectSort(a, len); break;
                            case 2: ArraySortingDll.Methods.doInsertMethod(a, len); break;
                            case 3: ArraySortingDll.Methods.doBubbleSort(a, len); break;
                            case 4: ArraySortingDll.Methods.doQuickSort(a, len); break;
                            default: Console.WriteLine("\nINCORRECT ATRRIBUTE\n"); break;
                        }
                    } while (method < 1 || method > 4);

                    int direction;
                    do
                    {
                        Console.WriteLine("Select the direction:");
                        Console.WriteLine("1. from min to max");
                        Console.WriteLine("2. from max to min");
                        direction = Convert.ToInt32(Console.ReadLine());
                        switch (direction)
                        {
                            case 1: break;
                            case 2: ArraySortingDll.Methods.reverse(a, len); break;
                            default: Console.WriteLine("\nINCORRECT ATRRIBUTE\n"); break;
                        }
                    } while (direction < 1 || direction > 2);

                    String output = "|";

                    for (int i = 0; i < len; i++)
                    {
                        output += a[i];
                        output += "|";
                    }

                    Console.WriteLine("\nRESULT:");
                    Console.WriteLine(output);
                    Console.ReadLine();
                }
                catch (Exception e) { Console.WriteLine(e.Message); fail = true; }
            }
        }
    }
}
