require 'pathname'

class Application
  ANSWERS_FILE = "#{Pathname.pwd}/testanswers.txt"
  RESPONSES_FILE = "#{Pathname.pwd}/testresponses.txt"

  def run
    puts 'Processing test answer data...'
    answers = File.readlines(ANSWERS_FILE)
    answers.each { |n| n.delete!("\n") }

    responses = File.readlines(RESPONSES_FILE)
    responses.each { |n| n.delete!("\n") }

    total_responses = responses.length
    correct = 0

    total_responses.times do |i|
      if answers[i] == responses[i]
        correct += 1
      end
    end

    puts "RESULTS: You have #{correct} correct answers"
  end
end

Application.new.run
