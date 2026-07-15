package com.example.jenkins_github_job.service;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JenkinsServiceTest {
    @Test
    void sumOfTwoDigitsTest() {
        assertThat(JenkinsService.sumOfTwoDigits(10, 2)).isEqualTo(12);
        assertThat(JenkinsService.sumOfTwoDigits(10, -2)).isEqualTo(8);
        assertThat(JenkinsService.sumOfTwoDigits(10, -12)).isEqualTo(-2);
        assertThat(JenkinsService.sumOfTwoDigits(10, -10)).isEqualTo(0);
    }

    @Test
    void isPositiveTest() {
        assertThat(JenkinsService.isPositive(10)).isTrue();
        assertThat(JenkinsService.isPositive(10000)).isTrue();
        assertThat(JenkinsService.isPositive(-10000)).isFalse();
        assertThat(JenkinsService.isPositive(0)).isFalse();
        assertThat(JenkinsService.isPositive(JenkinsService.sumOfTwoDigits(10, 2))).isTrue();
        assertThat(JenkinsService.isPositive(JenkinsService.sumOfTwoDigits(10, -12))).isFalse();
    }
}
