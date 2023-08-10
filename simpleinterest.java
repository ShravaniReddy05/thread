package com;

class simpleinterest extends Thread{
	public void run()
    {
        double p=12000;
        int rate=3;
        int time=4;
        double si;
        si=(p*rate*time)/100;
        System.out.println("SI : "+si);
    }
}
