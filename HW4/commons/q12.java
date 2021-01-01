format_string <- stack[0]
offset <- 1
while (parsing):
    token = tokenize_one_more(format_string)
    if (needs_integer (token)):
        value <- stack[offset]
        offset = offset + 1
