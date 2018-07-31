package cn.gloryroad;

public class Calculator {
	public int result = 0;
	public int add(int operand1,int operand2){
		result = operand1 + operand2;    //将两个传入参数进行相加操作
		return result; 
	}
	
	public int subtract(int operand1,int operand2){
		result = operand1 - operand2;    //将两个传入参数进行相减操作
		return result; 
	}
		
	public int multiple(int operand1,int operand2){
		result = operand1 * operand2;    //将两个传入参数进行相乘操作
		for(;;){						//些段代码写了一个死循环
			
		} 
	}
	
	public int divide(int operand1,int operand2){
		result = operand1 / 0;    //此段代码写了一个除数为0的除法运数
		return result; 
	}
	
	public int getResult(){
		return this.result;     //返回计算结果                                                                                                                                                                                                            
	}
}
