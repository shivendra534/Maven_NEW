pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                script {
                    if (isUnix()) { sh 'mvn clean compile' }
                    else          { bat 'mvn clean compile' }
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    if (isUnix()) { sh 'mvn test' }
                    else          { bat 'mvn test' }
                }
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}