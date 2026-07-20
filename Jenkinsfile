pipeline{
    agent any
    tools{
        maven 'maven_3_5_0'
    }
    stages{
        stage('Bulid Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/ismailhq/spring-boot-jenkins-two']])
                bat 'mvn clean install'
            }
        }
        stage('Build Docker Image'){
            steps{
                script{
                    bat 'docker build -t ismailhq/spring-boot-jenkins .'
                }
            }
        }
        stage('Push Docker Image to Hub'){
            steps{
                script{
                    bat 'docker login -u ismailhq -p 08301A0585@d'
                    bat 'docker push ismailhq/spring-boot-jenkins'
                }
            }
        }
        stage('Deploy to K8s'){
            steps{
                script{
                    bat "kubectl apply -f deploymentservice.yaml"
                }
            }
        }
    }
}