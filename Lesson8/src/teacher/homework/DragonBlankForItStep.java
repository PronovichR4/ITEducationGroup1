package teacher.homework;

public class DragonBlankForItStep {
	// ��� ����� ��������� ����� �����. ������ �� �����:
	private static int healthD;
	//public static int initHealthD; //��� �� ����� ��� ������
	public final static int DRAGON_INIT_HEALTH = 200; //��� �� ����� ��� ������
	private static int atackD = 5;
	private static int healthK;
	private static int atackK;
	private static int B; 
	private static int D;
	
	
	public static void main(String[] args) {
		System.out.println(Math.PI);
		int atackD = 7;
		System.out.println(atackD);
		for (;true;){
			int atackD = 7;
		}
		/*int healthD = 0; //������ �������� �� �������
		int atackD = 0;
		int healthK = 0;
		int atackK = 0;
		int B = 0;
		int D = 0;*/
		int turns = 0; //����� ������
		int actionNumber;
		
		printCurrentstat(turns, healthD, atackD, healthK, atackK);
		boolean end = false;
		while (!end){
			//actionNumber = choosedAction(healthD, atackD, healthK, atackK, B, D);
			/*//���� ���� �� ������� switch(actionNumber){}, �� ��� ���� ����� ����� �����. � ����� ���� �� ����� �������:
			if (actionNumber == 1) { //�������� 1 ������, ��� ������ ���� �� ������. � 2 - ��� ������ ����� ����������
				//...
			}
			if (actionNumber == 2) {
				//...
			}
			if (actionNumber == 3) {
				//...
			}
			if (actionNumber == 4) {
				//...
			}*/
			
			//switch (actionNumber) {
			switch (choosedAction()) {
			case 1:
				//�������
				break;
			case 2:
				//��������
				break;
			case 3:
				//���
				break;
			case 4:	
				//�����
				break;
			default: //������������
				System.out.println("���, �� ������� ������, �� ������ ����");
				//break; ������������ �� �����
			}
			
			//��������� �� ����� ��...
			//healthD = knightAtack(healthD, atackK);
			knightAtack();
			
			//...
			//if (turns > 2000) break; ����� � ��� ����������, ��� ����� ����� �� ��������.
		}
		//������� ���������
	}

	/* C++ example:
	 * private static int +(int healthD, int atackK) {
		//...
		return 0;
	}*/

	private static int knightAtack(int healthD, int atackK) {
		//...
		return 0;
	}
	
	private static void knightAtack() {
		//... 
	}


	private static int choosedAction() {
		//...
		return 0;
	}

	private static int buff() {
		//...
		return 0;	
	}

	private static int debuff() {
		//...
		return 0;	
	}
	
	private static void printCurrentstat(int turns, int healthD, int atackD, int healthK, int atackK) {
		//...
	}
	
	
	
	
	
	
	
	
	

}
	
	