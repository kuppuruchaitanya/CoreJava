package myexample;

import java.util.ArrayList;
import java.util.Set;
enum difficultyLevel
{
	EASY,MEDIUM,COMPLEX 
	
}
class Qpaper   
{
	private Set QPSet;
	private String subject;
	private difficultyLevel QPLevel=difficultyLevel.EASY;
}
class Question
{
	private int qno;
	private String question;
	private ArrayList answerlist;
	public int getQno() {
		return qno;
	}
	public void setQno(int qno) {
		this.qno = qno;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public ArrayList getAnswerlist() {
		return answerlist;
	}
	public void setAnswerlist(ArrayList answerlist) {
		this.answerlist = answerlist;
	}
}
public class Questions 
{

}
