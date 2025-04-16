pipeline {
    agent any
    tools{
        maven 'Maven'
    }
    stages{
        stage('Build maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/haripersonalwork/springbootdockerjenkinspipeline']])
                bat 'mvn clean install'

            }
        }
        stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t haripersonalwork/springbootdockerjenkinspipeline .'
                }
            }
        }
        stage('Push image to dockerhub'){
            steps{
                script{
                    withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                        bat 'docker login -u haripersonalwork -p %dockerhubpwd%'

                        bat 'docker push haripersonalwork/springbootdockerjenkinspipeline'
                    }
                }
            }
        }
    }
}