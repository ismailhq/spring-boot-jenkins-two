pipeline{
    agent any
    tools{
        maven 'maven_3_5_0'
    }
    stages{
        stage('Bulid Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/ismailhq/spring-boot-jenkins-two']])
                sh 'mvn clean install'
            }
        }
        stage('Build Docker Image'){
            steps{
                script{
                    sh 'docker build -t ismailhq/spring-boot-jenkins-two .'
                }
            }
        }
        stage('Push Docker Image to Hub'){
            steps{
                script{
                    sh 'docker login -u ismailhq -p 08301A0585@d'
                    sh 'docker push ismailhq/spring-boot-jenkins-two'
                }
            }
        }
        stage('Deploy to K8s'){
            steps{
                script{
                    sh "kubectl apply -f deploymentservice.yaml"
                }
            }
        }
    }
}