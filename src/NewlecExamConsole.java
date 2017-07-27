import java.util.Scanner;
import oop.interf.Exam;
import oop.interf.ExamConsole;

public class NewlecExamConsole extends ExamConsole {
	
	private NewlecExam exam;
	
	@Override
	public Exam newExam() {
		exam = new NewlecExam();
		return exam;
	}
	
	@Override
	public void input() {
		super.input();
		
		Scanner scan = new Scanner(System.in);
		int com=0;
		do{
			 System.out.print("\t\t��ǻ��: ");
			 com = scan.nextInt();
			 if(com<0||com>100) System.out.println("0~100������ ������ �Է��ϼ���.");
		 }while(com<0||com>100);
		
		exam.setCom(com);
		
	}

/*	@Override
	protected void onInput(Exam exam) {
		Scanner scan = new Scanner(System.in);
		int com=0;
		do{
			 System.out.print("\t\t��ǻ��: ");
			 com = scan.nextInt();
			 if(com<0||com>100) System.out.println("0~100������ ������ �Է��ϼ���.");
		 }while(com<0||com>100);
		
		((NewlecExam)exam).setCom(com);
	}*/

	@Override
	protected void onPrint(Exam exam) {
		int com = this.exam.getCom();
		System.out.printf("\t\t��ǻ��: %d\n", com);
	}
	
}
