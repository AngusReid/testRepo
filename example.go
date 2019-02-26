// Package main used for testing the tenet
package main

import (
	"fmt"
)

func main() {
	fmt.Println("Hello, playground")
	// This comment not on a func decl
}

/* foo is the first word
 */
func foo() {}


/* Foo is the first word
 */
func Foo() {}

/* This func comment should begin with 'bar'
 */
func bar() {}

/* Bar: This func comment should begin with 'Bar'
 */
func Bar() {}

// This func comment should begin with 'baz'
// and we should not worry about this line
func baz() {}

// Baz: This func comment should begin with 'Baz'
// and we should not worry about this line
func Baz() {}

// This is called by a xyz
func qux() {}

// Qux is called by a xyz
func Qux() {}

// The quux will handle xyz
func quux() {}

// Quux will handle xyz
func Quux() {}
