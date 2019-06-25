pipeline {
     agent any
     stages {
          stage("Build") {
               steps {
                    sh "./gradlew compileJava"
                    sh './jenkins_build.sh'
                    junit '*/build/test-results/*.xml'
                    step( [ $class: 'JacocoPublisher' ] )
               }
          }
          stage("Unit test") {
               steps {
                    sh "./gradlew test"                   
               }
          }         
      }
}
