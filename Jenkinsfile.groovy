Jenkinsfile (Declarative Pipeline)
pipeline { 
    agent any  
    tools {
        maven 'apache-maven-3.6.1' 
    }
    stages { 
        stage('Build') { 
            steps { 
               echo 'This is a minimal pipeline.' 
            }
        }
    }
}
