package com.example.android;

public class QuestionModelClass {
    String username;
    String email;
    String heading;
    String answer;

    public QuestionModelClass(){

    }

    public QuestionModelClass(String username, String email, String heading, String answer) {
        this.username = username;
        this.email = email;
        this.heading = heading;
        this.answer = answer;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
