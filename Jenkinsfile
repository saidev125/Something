pipeline {
     agent any
     stages {
          stage("Build") {
               steps {
                    sh "./gradlew compileJava"                                                        
               }
          }
          stage("Unit test") {
               steps {
                    sh "./gradlew test"                   
               }
          }
          stage("Code coverage") {
               steps {                   
                    publishHTML (target: [
                              reportDir: 'build/reports/jacoco/test/html',
                              reportFiles: 'index.html',
                              reportName: "JaCoCo Report" ])
                    sh "./gradlew jacocoTestCoverageVerification'
	               }
          }             
      }
}
