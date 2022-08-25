def call(Map my-config = [:]) {
   sh "echo welcome ${my-config.name} Today is ${my-config.day}"
}
