from typing import List


class Solution:
    def canFinish(self, numCourses: int, prerequisites: List[List[int]]) -> bool:

        course_nodes = {}

        class CourseNode:
            def __init__(self, course):
                self.course = course
                self.adjacency_nodes = set()

        for prerequisite in prerequisites:
            wanted = prerequisite[0]
            needed = prerequisite[1]
            if course_nodes.get(wanted) is None:
                course_nodes[wanted] = CourseNode(wanted)

            if course_nodes.get(needed) is None:
                course_nodes[needed] = CourseNode(needed)

            course_nodes[needed].adjacency_nodes.add(course_nodes[wanted])

        if len(course_nodes) > numCourses:
            return False

        visiting = set()
        visited = set()

        def dfs(course_node):
            """False means Cycle existed."""
            if course_node.course in visiting:
                return False

            if course_node.course in visited:
                return True

            visiting.add(course_node.course)
            for adjacency_node in course_node.adjacency_nodes:
                if not dfs(adjacency_node):
                    return False
            visited.add(course_node.course)
            visiting.remove(course_node.course)
            return True

        for course in course_nodes:
            if not dfs(course_nodes.get(course)):
                return False

        return True
