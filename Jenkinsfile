pipeline {
  agent {
    docker {
      image 'gradle'
    }

  }
  stages {
    stage('Test') {
      parallel {
        stage('Test Gradle') {
          steps {
            sh 'gradle -version'
          }
        }

        stage('Test Java') {
          steps {
            sh 'java -version'
          }
        }

        stage('Test others') {
          steps {
            sh '''which java|| echo "no java"
which gradle || echo "no gradle"
which maven || echo "no maven"
which mvn || echo "no mvn"'''
          }
        }

      }
    }

  }
}