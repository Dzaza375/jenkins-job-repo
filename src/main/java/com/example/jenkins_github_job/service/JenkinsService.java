package com.example.jenkins_github_job.service;

public class JenkinsService {
    public static int sumOfTwoDigits(int number1, int number2) {
        return number1 + number2;
    }

    public static  <T extends Number> boolean isPositive(T number) {
        return number.doubleValue() > 0;
    }
}
