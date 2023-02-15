package test;

public class Songyeonsu2 {

	public static void main(String[] args) {
		System.out.println("--------------1번--------------");
		String output1 = "";
		for(int i=1;i<10;i++) {
			for(int j=0;j<i;j++){
				output1+="*";
			}
			output1+="\n";
		}
		System.out.print(output1);

		System.out.println("--------------2번--------------");
		String output2 = "";
		for(int i=1;i<10;i++) {
			
			for(int j=10;j>i;j--){
				output2+=" ";
			}
			for(int k=0;k<i;k++) {
				output2+="*";
			}
			output2+="\n";
		}
		System.out.print(output2);

		System.out.println("--------------3번--------------");
		String output3 = "";
		for(int i=1;i<15;i++){
			for(int j=15;j>i;j--){
				output3+=" ";
			}
			for(int k=0;k<2*i-1;k++){
				output3+="*";
			}
			output3+="\n";
		}
		System.out.print(output3);

		System.out.println("--------------4번--------------");
		String output4 = "";
		for(int i=1;i<15;i++){
			for(int j=0;j<i;j++){
				output4+=" ";
			}
			for(int k=28;k>2*i-1;k--){
				output4+="*";
			}
			output4+="\n";
		}
		System.out.print(output4);
	}
}
