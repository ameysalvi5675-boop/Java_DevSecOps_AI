pipeline
{
    agent any

    stages{
        stage('Checkout'){
            steps{
                git 'https://github.com/ameysalvi5675-boop/Java_DevSecOps_AI.git'
            }
        }

        stage('Build'){
            steps{
                bat'mvn clean package'
            }
        }

        stage('Test'){
            steps{
                bat 'mvn test'
            }
        }
    } 
}
