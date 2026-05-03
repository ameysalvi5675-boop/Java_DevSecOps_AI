pipeline
{
    agent any

    stages{
        stage('Checkout') {
    steps {
        git branch: 'main',
            url: 'https://github.com/ameysalvi5675-boop/Java_DevSecOps_AI.git'
    }
}

        stage('Build'){
            steps{
                sh 'mvn clean package'
            }
        }

        stage('Test'){
            steps{
                sh 'mvn test'
            }
        }
    } 
}
