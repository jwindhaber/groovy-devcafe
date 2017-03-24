package com.groovy.devcafe.closures

def isOdd = { int i-> i%2 == 1 }
assert isOdd(3)
assert !isOdd.call(2)

println "Hello World"
