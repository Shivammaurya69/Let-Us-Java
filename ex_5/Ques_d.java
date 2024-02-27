package com.ex_5;
public class Ques_d {
        public static void main(String[] arg)
        {
            int p_num, j;
            for(p_num=1; p_num<=300; p_num++)
            {
                for (j=2; j<p_num; j++)
                {
                    if (p_num%j==0)
                        break;
                }
                if (p_num==j)
                    System.out.println(p_num);
            }
        }
    }