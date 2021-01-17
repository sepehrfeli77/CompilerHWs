_main;
  BeginFunc 20
  t0 = 24
  a = t0
  t1 = 36
  b = t1
  pushParams t1
  pushParams t0
  t2 = Lcall _gcc
  popParams 8
  endfunc
_gcc
 beginfunc 16
 t0 = x
 t1 = y
 ifz t0 goto L0
 t2 = y \% x
 r = t2
 pushParams t0
 pushparams t2
 lcall gcc
 popParams 8
 endfunc
 L0:
  return t1
