_f:
  BeginFunc 8;
  _t0 = 1;
  _t1 = 4;
  n = n + _t0
  k = k + _t1
	PushParam n;
  PushParam k;
  LCall _printf;
  PopParam 8;
  n = k;
  EndFunc;

main:
  BeginFunc 4;
  n = 0;
  _t0 = n;
  PushParam _t0;
  LCall _f;
  PopParam 4;
  PushParam n;
  LCall _printf;
  PopParam 4;
  EndFunc;
