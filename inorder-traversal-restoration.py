def convert(post):
    if len(post) == 1:
        return post
    left = post[:len(post)//2]
    right = post[len(post)//2:len(post)-1]
    root = post[len(post)-1]
    return convert(left) + root + convert(right)

post = input()

print(convert(post))