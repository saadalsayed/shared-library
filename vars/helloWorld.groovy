def call(string name,string dayofweek) {
   sh 'echo "welcome $(name). Today is $(dayofweek)."'
}
