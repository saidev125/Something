pipeline {
     agent any
     stages {
          stage("Build") {
               steps {
                    sh "./gradlew compileJava"  
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
