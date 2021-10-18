package com.company.views;

import java.util.Scanner;

public class CmdLineView {

        private float income;
        private int startReqeust;
        private float maintCost;
        private String maintName;
        private int mainYear;
        private int mainMonth;
        private int mainDay;
        private float amountLeft;
        private String mod;
        private float modCost;
        private float spent;

        public int startRequest(){
            System.out.println("What would you like to do?:\n");
            Scanner input = new Scanner(System.in);

            return input.nextInt();
        }


}
