main:
  BeginFunc 8;  //allocate 8 bytes for locals and temporary registers for function main
  _t0 = (value for parameter x); //
  PushParam _t0;
  PushParam c;
  LCall _C.f;
  PopParams 8;
  EndFunc;


