package cn.gloryroad;

public class Calculator {
	public int result = 0;
	public int add(int operand1,int operand2){
		result = operand1 + operand2;    //�������������������Ӳ���
		return result; 
	}
	
	public int subtract(int operand1,int operand2){
		result = operand1 - operand2;    //������������������������
		return result; 
	}
		
	public int multiple(int operand1,int operand2){
		result = operand1 * operand2;    //�������������������˲���
		for(;;){						//Щ�δ���д��һ����ѭ��
			
		} 
	}
	
	public int divide(int operand1,int operand2){
		result = operand1 / 0;    //�˶δ���д��һ������Ϊ0�ĳ�������
		return result; 
	}
	
	public int getResult(){
		return this.result;     //���ؼ�����                                                                                                                                                                                                            
	}
}
