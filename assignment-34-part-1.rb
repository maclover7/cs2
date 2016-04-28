require 'pathname'

class Application
  INTEGER_FILE = "#{Pathname.pwd}/fnum1.txt"

  def run
    puts 'Loading in file...'
    numbers = File.readlines(INTEGER_FILE)
    numbers.each { |n| n.delete!("\n") }
    numbers.map!(&:to_i)

    # output all numbers, eight per line
    puts 'Your numbers include...'
    numbers.each_slice(8) do |set|
      puts '- ' + set.join(', ')
    end

    # get highest number
    puts "The highest number is: #{numbers.max}"

    # get sum
    puts "The sum of all of the numbers is #{numbers.inject { |sum, x| sum + x }}"

    # number of numbers
    puts "There are #{numbers.length} numbers in the file."
  end
end

Application.new.run
