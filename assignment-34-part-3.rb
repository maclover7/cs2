require 'pathname'
require 'ostruct'

class Application
  ANSWERS_FILE = "#{Pathname.pwd}/testanswers.txt"
  RESPONSES_FILE = "#{Pathname.pwd}/testresponses.txt"

  class Student < Struct.new(:correct, :id, :responses)
  end

  def run
    puts 'Processing test answer data...'
    answers = File.readlines(ANSWERS_FILE)
    answers.each { |n| n.delete!("\n") }

    responses = File.readlines(RESPONSES_FILE)
    responses.each { |n| n.delete!("\n") }

    # Create a student object for every line of responses
    students = []
    responses.each do |res|
      res = res.split(' ')

      stud = Student.new
      stud.id = res.delete(res[0])
      stud.responses = res
      stud.correct = 0
      students << stud
    end

    students.each do |student|
      responses = student.responses
      responses.length.times do |i|
        if answers[i] == responses[i]
          student.correct += 1
        end
      end

      puts "RESULTS:"
      puts "#{student.id} got #{student.correct} correct answers"
    end
  end
end

Application.new.run
