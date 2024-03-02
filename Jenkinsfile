pipeline {
    agent any
    tools {
        maven 'Maven'
        jdk 'jdk'
        sonarQube 'sonarQube' 
    }
    stages {
        stage('Clean') {
            steps {
                sh 'mvn clean'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit allowEmptyResults: true, testResults: '**/test-results/*.xml'
                }
            }
        }
        stage('Build') {
            steps {
                sh 'mvn package'
            }
        }
        stage('SonarQube analysis') {
            steps {
                script { def scannerHome = tool 'sonarQube'
                    withSonarQubeEnv('sonarQube') { 
                        sh "${scannerHome}/bin/sonar-scanner"
                    }
                }
            }
        }
    }
}
