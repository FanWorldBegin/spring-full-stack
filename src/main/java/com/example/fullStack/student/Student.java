package com.example.fullStack.student;

import lombok.*;

import javax.persistence.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
// 以上可以使用 @Data 代替 但是@Data 修饰的是 final 类型 当使用 jpa 的时候这些不是final
@Entity
@Table
public class Student {
    @Id

    @SequenceGenerator(
            name="student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1 // 一个一个创建
    )
    @GeneratedValue(
            generator = "student_sequence",
            strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String email;
    //@Enumerated用于标注枚举字段，可以设置字段类型
    @Enumerated(EnumType.STRING)
    private Gender gender;

    public Student(String name, String email, Gender gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

}
