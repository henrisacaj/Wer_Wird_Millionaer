import java.util.*;

public class Question {
	private String question;
	private int difficulty;
	private List<String> answers;
	private String correctAnswer;
	
	public Question(String question, int difficulty, List<String> answers, String correctAnswer) {
		this.question = question;
		this.difficulty = difficulty;
		this.answers = answers;
		this.correctAnswer = correctAnswer;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<String> getAntworten() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public void setAnsw(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public int getDifficulty() {
		return difficulty;
	}
	
	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
		
	
}
