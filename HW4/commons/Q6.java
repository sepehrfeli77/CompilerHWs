cgen(do stmt while(expr))={
	let L_before be a new label
	let L_after be a new label
	Emit(L_before:)
	cgen(stmt)
	let t = cgen(expr)
	Emit(Ifz t GOTO L_after)
	Emit(GOTO L_before)
	Emit(L_after)
}
