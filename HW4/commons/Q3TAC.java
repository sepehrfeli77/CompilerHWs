main:
  BeginFunc 8;  //allocate 8 bytes for locals and temporary registers for function main
  _t0 = (value for parameter x); //save value of x in t0
  PushParam _t0; //push t0 to stack frame
  PushParam c; //push an object of C to stack frame
  LCall _C.f; // Call function f()
  PopParams 8; // pop parameters that we've been pushed in stack (t0 and c)
  EndFunc;


