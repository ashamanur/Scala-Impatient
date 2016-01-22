// What happens when you zip together two strings, such as "Hello".zip("World")?
// Come up with a plausible use case.

"Hello".zip("World")
//scala.collection.immutable.IndexedSeq[(Char, Char)] = Vector((H,W), (e,o), (l,r), (l,l), (o,d))

// Useful in bundling two values. - useful when you want to join two lists/seqs into one
// If one of them contains more number of elements than the other, then the elements at the end of the
// longer collection are dropped